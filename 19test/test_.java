class Start{
    public static void main(String[] data){
        Player p = new Player();
	p.name = "David B";
	p.number = 7;
	Player q = new Player("Michael O",10);
        System.out.println("HI");
    }
}

class Player{
    String name;    
    int number;
    Player(String s, int n){
        name = s;
	number = n;
    }
    
    Player(){
	// nothing:
    }
}