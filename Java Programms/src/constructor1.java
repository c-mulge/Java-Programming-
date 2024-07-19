class MyEmployee{
    private int id;
    private String name;
    public MyEmployee(){
        id=12;
        name="name-here";
    }

    public MyEmployee(String n,int i){
        id=i;
        name=n;
    }
    public String getname(){return name;}
    public void setname(String n){this.name=n;}
    public void setid(int i){this.id=i;}
    public int getid(){return id;}
}

public class constructor1 {
    public static void main(String[] args) {
//        MyEmployee emp=new MyEmployee();
        MyEmployee emp=new MyEmployee("name-goes-here",18);
        System.out.println(emp.getid());
        System.out.println(emp.getname());
    }
}
