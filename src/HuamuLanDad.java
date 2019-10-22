class HuamuLanDad{
    public static void main(String args[]){
        HuamuLanBA dad = new Huamulan();
        dad.eat();
        dad.sleep();
        //dad.cat();
        System.out.println(dad.num);
        System.out.println(dad.age);
    }
}

class HuamuLanBA {
    int num = 10;
    static int age = 40;
    public void eat(){
        System.out.println("Dad is eating!");
    }
    public static void sleep(){
        System.out.println("Dad is sleeping!");
    }
}

class Huamulan extends HuamuLanBA{
    int num = 110;
    static int age = 18;
    public void eat(){
        System.out.println("Daughter is eating!");
    }
    public static void sleep(){
        System.out.println("Daughter is sleeping!");
    }
    public void cat(){
        System.out.println("catch no one");
    }
}
