package com.example.LOGdatabase.domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Deffect {
	 @Id
	 private String ID_DEF;
	 private String Severity;
	 private String errorcode;
	 private String ID_sol;
	 
	 
	 
    

     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "solution_id")
     private Solutions solution_id;
     
	 @OneToMany(cascade = CascadeType.ALL, mappedBy="deffect_id")

	 private List<Deffect_instance> DeffectsIns;
     //Getter and setter
     public List<Deffect_instance> getDeffect_Instance() {
       return DeffectsIns;
     }
     public void setDeffect_Instance(List<Deffect_instance> defects) {
       this.DeffectsIns = defects;
     }
	 
	public String getID_DEF() {
		return ID_DEF;
	}
	public void setID_DEF(String iD_DEF) {
		ID_DEF = iD_DEF;
	}
	public String getSeverity() {
		return Severity;
	}
	public void setSeverity(String severity) {
		Severity = severity;
	}
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getID_sol() {
		return ID_sol;
	}
	public void setID_sol(String iD_sol) {
		ID_sol = iD_sol;
	}
	public Deffect(String iD_DEF, String severity, String errorcode, String iD_sol) {
		super();
		ID_DEF = iD_DEF;
		Severity = severity;
		this.errorcode = errorcode;
		ID_sol = iD_sol;
	}
	public Deffect() {
		super();
		// TODO Auto-generated constructor stub
	}

}
