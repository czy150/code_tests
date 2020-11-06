public class Class2 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Class2() {
		System.out.println("无构造方法执行");
	}

	public Class2(String Name, int Age) {
		this.name = Name;
		this.age = Age;
	}

	public void replaceFirstPlayers(String[] players, String playername) {
		System.out.println("将第一个球员替换为：");
		players[0] = playername;
	}

	public Class2(int s) {
		System.out.println("yige参数");
	}

	public static void main(String[] args) {
		new Class2();
		Class2 class3 = new Class2("czy", 25);
		new Class2(34);
		System.out.println(class3.name + " is " + class3.age);
		String[] players = { "詹姆斯", "科比", "乔丹", "库里" };
		String playername = "czy";
		Class2 team = new Class2();
		team.replaceFirstPlayers(players, playername);
		System.out.println("替换后的球员为");
		for (String player : players) {
			System.out.print(player + "\t");
		}
		System.out.println("\n 替换上场的是" + playername);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
