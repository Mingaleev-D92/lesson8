package ru.innopolis.university.mingaleev.homework_3_8.task_3;

public class Convertation {
    private Act convert(Сontract contract){
        return new Act(contract.getNumberContract(),contract.getDateContract(),
                contract.getMassivContract());
    }

    public static void main(String[] args) {
        Сontract contract1 = new Сontract();
    }
}
