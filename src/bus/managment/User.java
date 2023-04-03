/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus.managment;

/**
 *
 * @author prach
 */
class User {
    private int id;
    private String busnoD;
    private String busMoveD;
    private String  bussourceD ;
    private String  busdestD ;
    private int departDate;
    private int departTimeD;
    private String priceD;
    private String seatD;
    
    public User(int id,String bus_no,String movement,String bus_source,String bus_dest,int depart_date,int depart_time,String price,String total_seat){
        this.id=id;
        this.busnoD=bus_no;
        this.busMoveD=movement;
        this.bussourceD=bus_source;
        this.busdestD=bus_dest;
        this.departDate=depart_date;
        this.departTimeD=depart_time;
        this.priceD=price;
        this.seatD=total_seat;
    }
    public int getid(){
        return id;
    }
    public String getbus_no(){
        return busnoD;
    }
    public String getmovement(){
        return busMoveD;
    }
    public String getbus_source(){
        return bussourceD;
    }
    public String getbus_dest(){
        return busdestD;
    }
    public int getdepart_date(){
        return departDate;
    }
    public int getdepart_time(){
        return departTimeD;
    }
    public String getprice(){
        return priceD;
    }
    public String gettotal_seat(){
        return seatD;
    }
}
