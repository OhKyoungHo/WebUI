package homework;

class Person{
	String owner;
	String account;
	int money;
	int outmoney;
	int inmoney;

	public void in(int inmoney) {
		this.inmoney=inmoney;
		System.out.println("입금한 금액은 " + inmoney+ "입니다.");
		money +=inmoney;
	}
	public void out(int outmoney) {
		this.outmoney = outmoney;
		if(money<outmoney) {
			System.out.println("잔액이 부족합니다.");
		}else if(money>=outmoney) {
			System.out.println("인출한 금액은 " + outmoney +"입니다.");
			money-=outmoney;
		}
	}
	@Override
	public String toString() {
		return("예금주 :" + owner +", 계좌번호 : " + account + ", 잔액 : " + money +"원");

	}


	public static void main(String[] args) {
		Person p =new Person();
		p.owner = "자바맨";
		p.account = "123-456";
		p.money = 11000;
		p.in(0);
		p.out(0);
		System.out.println(p.toString());

	}
}
