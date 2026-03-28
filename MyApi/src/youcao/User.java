package youcao;

import java.util.StringJoiner;

//Cloneable
//如果一个接口中没有抽象方法
//表示当前的接口是一个标记型接口
//如果Cloneable可被实现，就表示当前类可被克隆
public class User  implements Cloneable {
    private int id;
    private String userName;
    private String password;
    private String path;
    private int[] data; //游戏数据


    public User() {
    }

    public User(int id, String userName, String password, String path, int[] data) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.path = path;
        this.data = data;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }


    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{id = " + id + ", userName = " + userName + ", password = " + password + ", path = " + path + ", data = " + getData(data) + "}";
    }
    public String getData(int[] data)  {
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+" ");
        }
        return sj.toString();

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
