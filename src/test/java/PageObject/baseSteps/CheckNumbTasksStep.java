package PageObject.baseSteps;

import io.qameta.allure.Step;

import static PageObject.baseElements.CheckNumbTaskElem.countTask;
import static WebHooks.Hooks.saveAsScreenshot;

public class CheckNumbTasksStep {
    @Step("общее количество задач")
    public static void checkTask(){
        //создаем цикл который будет создавать число задач
        //последнюю цифру умножаем на 10 в степени и плюсуем к старому числу
        int count=1;
        int number=0;
        char[] k = countTask.getText().toCharArray();
        for(int i=k.length-1;!Character.isWhitespace(k[i]);i--) {
            number += count * (Character.getNumericValue(k[i]));

            count = count * 10;
        }
        saveAsScreenshot();
    }
}
