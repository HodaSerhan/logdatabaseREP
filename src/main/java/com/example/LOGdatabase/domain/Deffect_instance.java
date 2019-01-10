package com.example.LOGdatabase.domain;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Deffect_instance {
	 @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	 private String id;
	 private String id_App;
	 private String ID_DEF;
	 private String id_LOG;
	 
	 
	 @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "app_id")
     private App app_id;

     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "deffect_id")
     private Deffect deffect_id;
     
     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "logFile_id")
     private LogFile logFile_id;
     
     
     
     
     //Getter and setter
   /*  public App getApp() {
       return app;
     }

     public void setApp(App app) {
       this.app = app;
     }
*/
     

     //Getter and setter
  /*   public Deffect getDeffect() {
       return this.deffect;
     }

     public void setDeffect(Deffect Deffect) {
       this.deffect = Deffect;
     }*/
	 
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId_App() {
		return id_App;
	}
	public void setId_App(String id_App) {
		this.id_App = id_App;
	}
	public String getID_DEF() {
		return ID_DEF;
	}
	public void setID_DEF(String iD_DEF) {
		ID_DEF = iD_DEF;
	}
	public String getId_LOG() {
		return id_LOG;
	}
	public void setId_LOG(String id_LOG) {
		this.id_LOG = id_LOG;
	}
	public Deffect_instance(String id, String id_App, String iD_DEF, String id_LOG) {
		super();
		this.id = id;
		this.id_App = id_App;
		ID_DEF = iD_DEF;
		this.id_LOG = id_LOG;
	}
	public Deffect_instance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}