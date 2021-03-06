package femr.data.models;

import femr.common.models.IPatientEncounterVital;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "patient_encounter_vitals")
public class PatientEncounterVital implements IPatientEncounterVital {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Column(name = "patient_encounter_id", nullable = false)
    private int patientEncounterId;
    @Column(name = "vital_id", nullable = false)
    private int vitalId;
    @Column(name = "vital_value", nullable = false)
    private float vitalValue;
    @Column(name = "date_taken", nullable = false)
    private String dateTaken;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getUserId() {
        return userId;
    }

    @Override
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public int getPatientEncounterId() {
        return patientEncounterId;
    }

    @Override
    public void setPatientEncounterId(int patientEncounterId) {
        this.patientEncounterId = patientEncounterId;
    }

    @Override
    public int getVitalId() {
        return vitalId;
    }

    @Override
    public void setVitalId(int vitalId) {
        this.vitalId = vitalId;
    }

    @Override
    public float getVitalValue() {
        return vitalValue;
    }

    @Override
    public void setVitalValue(float vitalValue) {
        this.vitalValue = vitalValue;
    }

    @Override
    public String getDateTaken() {
        return dateTaken;
    }

    @Override
    public void setDateTaken(String dateTaken) {
        this.dateTaken = dateTaken;
    }
}
