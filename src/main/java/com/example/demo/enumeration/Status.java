/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.enumeration;

@SuppressWarnings("ALL")
public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");
    private final String status;
    Status(String status){
        this.status = status;
    }

    public String getStatus(){
        return  this.status;
    }

}
