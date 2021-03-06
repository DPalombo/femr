package femr.common.models;

import org.joda.time.DateTime;

public interface IPatientEncounterPmhField {
    int getId();

    int getPatientEncounterId();

    void setPatientEncounterId(int patientEncounterId);

    int getPmhFieldId();

    void setPmhFieldId(int hpiFieldId);

    String getPmhFieldValue();

    void setPmhFieldValue(String hpiFieldValue);

    DateTime getDateTaken();

    void setDateTaken(DateTime dateTaken);

    int getUserId();

    void setUserId(int userId);
}
