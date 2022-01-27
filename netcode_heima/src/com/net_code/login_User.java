package com.net_code;

import java.util.Objects;

public class login_User {
    private String username;
    private  String password;
    public login_User(){
        super();
    }
//重写equals方法，因为在mian中使用contain函数，arrlist底层实现如下

    /**
     *  public boolean contains(Object o) {
     *         return indexOf(o) >= 0;
     *     }
     *
     *     /**
     *      * Returns the index of the first occurrence of the specified element
     *      * in this list, or -1 if this list does not contain the element.
     *      * More formally, returns the lowest index <tt>i</tt> such that
     *      * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
     *      * or -1 if there is no such index.
     *
     *  public int indexOf(Object o) {
     *if (o == null) {
     *for (int i = 0; i < size; i++)
     *if (elementData[i] == null)
     *return i;
     *} else {
     *for (int i = 0; i < size; i++)
     *if (o.equals(elementData[i]))**********************************************************----------------******
     *return i;
     *}
     *return -1;
     *}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        login_User that = (login_User) o;
        return Objects.equals(getUsername(), that.getUsername()) &&
                Objects.equals(getPassword(), that.getPassword());
    }

    public  login_User(String username, String password){
        super();
        this.username= username;
        this.password=password;
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public  void setPassword(String password){
        this.password=password;
    }
}
