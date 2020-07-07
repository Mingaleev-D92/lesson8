
package ru.innopolis.university.mingaleev.homework_3_8.task_3;

public class Сontract {
    private int numberContract;
    private String dateContract;
    private String[] massivContract;

   Сontract()
    {
        this.numberContract = numberContract;
        this.dateContract = dateContract;
        this.massivContract = massivContract;
    }

    public void setDateContract(String dateContract) {
        this.dateContract = dateContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public void setMassivContract(String[] massivContract) {
        this.massivContract = massivContract;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public String getDateContract() {
        return dateContract;
    }

    public String[] getMassivContract() {
        return massivContract;
    }
}
