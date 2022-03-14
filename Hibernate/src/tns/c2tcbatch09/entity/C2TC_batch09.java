package tns.c2tcbatch09.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("   C2TC_batch09")

public class C2TC_batch09 extends Student {
private String Tech_trainner;
private String Softskill_trainner;
public String getTech_trainner() {
	return Tech_trainner;
}
public void setTech_trainner(String tech_trainner) {
	Tech_trainner = tech_trainner;
}
public String getSoftskill_trainner() {
	return Softskill_trainner;
}
public void setSoftskill_trainner(String softskill_trainner) {
	Softskill_trainner = softskill_trainner;
}
@Override
public String toString() {
	return "C2TC_batch09 [Tech_trainner=" + Tech_trainner + ", Softskill_trainner=" + Softskill_trainner + "]";
}

}
