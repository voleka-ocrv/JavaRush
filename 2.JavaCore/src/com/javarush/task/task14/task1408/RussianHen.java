package com.javarush.task.task14.task1408;

//public class RussianHen {
//}
public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + "." +
                " Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
