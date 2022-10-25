/**
 *
 */
// 메뉴
const menu = [
  { name: "타로밀크티", cost: 4700, url: "taro.png" },
  { name: "블랙밀크티", cost: 4700, url: "black.png" },
  { name: "제주그린밀크티", cost: 4900, url: "green.png" },
  { name: "우롱티", cost: 3700, url: "wrong.jpg" },
  { name: "패션후르츠히비스커스", cost: 4700, url: "fasion.png" },
  { name: "망고요구르트", cost: 5200, url: "mangoyogu.png" },
  { name: "자몽주스", cost: 4600, url: "jamong.png" },
  { name: "망고스무디", cost: 5500, url: "mangosmooth.png" },
  { name: "얼그레이", cost: 3700, url: "earlgrey.jpg" },
];

// 토핑 선택 창
const topping = ["밀크폼", "펄", "코코넛", "알로에", "화이트펄", "치즈폼"];
let topping_select = "<select class=topping_select>";
topping_select += "<option value=''>토핑 없음</option>";
for (let topp of topping) {
  topping_select += "<option>" + topp + "</option>";
}
topping_select += "</select>";

// 당도 선택 창
const sweets = [0, 30, 50, 70, 100];
let sweets_select = "<select class=sweets_select>";
for (let sweet of sweets) {
  sweets_select += "<option>" + sweet + "</option>";
}
sweets_select += "</select>";

// 개수 선택창
let cnt_select = "<select class=cnt_select>";
for (let i = 1; i <= 5; i++) {
  cnt_select += "<option>" + i + "</option>";
}
cnt_select += "</select>";

$(function () {
  // 메뉴 넣기
  let text = "";
  for (let idx = 0; idx < menu.length; idx++) {
    if (idx % 3 == 0) {
      text += "<tr class='menus'>";
    }
    text += "<td class='menu' id='menu" + idx + "'>";
    text += "<img src='./images/" + menu[idx]["url"] + "'/> <br/>";
    text += "<span class='label'>" + menu[idx]["name"] + "</span>";
    text += "<span class='price'>" + menu[idx]["cost"] + "</span>원<br/>";
    text += "<button class='order' type='button'>주문</button>";
    text += "</td>";

    if (idx % 3 == 2 || idx == menu.length - 1) {
      text += "</tr>";
      $("table.menutbl").append(text);
      text = "";
    }
  }

  // 주문 버튼 클릭시 주문내역에 넣기
  for (let idx = 0; idx < menu.length; idx++) {
    const item = $("#menu" + idx);
    item.find(".order").click(function () {
      const itemName = menu[idx]["name"];
      const itemCost = menu[idx]["cost"];
      let order = "";
      order += "<tr class='orderItem' item='" + idx + "'>";
      order += "<td class='name'>" + itemName + "</td>"; // 상품명
      order += "<td class='topping'>" + topping_select + "</td>"; // 토핑
      order += "<td class='sugar'>" + sweets_select + "</td>"; // 당도
      order +=
        "<td class='temper'><button class='btnTemper' type='button'>아이스</button></td>"; // 얼음
      order += "<td class='cnt'>" + cnt_select + "</td>"; // 개수
      order += "<td class='price'>" + itemCost + "</td>"; // 가격
      order += "<td><button type='button' class='btnDelete'>삭제</button></td>";
      order += "</tr>";
      $("table#listTable").append(order);
    });
  }

  // 토핑 변경시 가격 변동
  $(document).on("change", ".topping select", function () {
    const table = $(this).parents("tr.orderItem");
    changePrice(table);
  });

  // 개수 변경시
  $(document).on("change", ".cnt select", function () {
    const table = $(this).parents("tr.orderItem");
    changePrice(table);
  });

  // 가격 변경
  // 인자 : 가격 변경하는 행
  function changePrice(table) {
    const idx = table.attr("item");
    const topp = table.children(".topping").find("select").val();
    const tot = table.children(".price");
    const cnt = table.children(".cnt").find("select").val();
    if (topp == "") {
      tot.text(menu[idx]["cost"] * cnt);
    } else {
      tot.text((menu[idx]["cost"] + 1300) * cnt);
    }
  }

  // 아이스 버튼 클릭시 핫으로 변경
  $(document).on("click", ".btnTemper", function () {
    if ($(this).text() == "아이스") {
      $(this).text("핫");
    } else {
      $(this).text("아이스");
    }
  });

  // 삭제버튼 클릭시 주문내역에서 삭제
  $(document).on("click", ".btnDelete", function () {
    const table = $(this).parents("tr.orderItem");
    table.fadeOut(1000);
    setTimeout(function () {
      table.remove();
    }, 1000);
  });

  // 주문하기 버튼 클릭시 총합 가격 계산
  $("#btn").click(function () {
    let sum = 0;
    $("#listTable .price").each(function () {
      sum += 1 * $(this).text();
    });

    $("#total").val(sum);
  });
  
  
});
