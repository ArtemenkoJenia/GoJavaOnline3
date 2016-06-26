package ua.artemenko.student.goit.company.module_09.subsidiary;


import ua.artemenko.student.goit.company.module_09.processData.EncryptString;

public abstract class AbstractAuxiliary {
    public static boolean encrypt = false;
    protected boolean encrypted = false;

    protected StringBuffer objectToString;
    protected abstract void objectToStringBuilder();

    @Override
    public String toString() {
        if (objectToString == null) {
            objectToStringBuilder();
        }
        if ((AbstractAuxiliary.encrypt) && (!encrypted)) {
            EncryptString.encryptString(objectToString,AbstractAuxiliary.encrypt);
            encrypted = true;
        }
        if ((!AbstractAuxiliary.encrypt) && (encrypted)) {
            EncryptString.encryptString(objectToString,AbstractAuxiliary.encrypt);
            encrypted = false;
        }

        return objectToString.toString();
    }

}
