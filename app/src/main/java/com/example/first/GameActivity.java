package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //следующая строка загружает наш графический интерфейс на экран девайса
        setContentView(R.layout.activity_game);

        //далее инициализируем переменные
        int partA = 9;
        int partB = 3;

        int correctAnswer = partA * partB;
        int wrongAnswer1 = correctAnswer++;
        int wrongAnswer2 = correctAnswer - 12;

        /*Здесь мы создаём объект, основанный на классе TextView и Button соответственно,
        а также связываем эти объекты к соответствующим элементам графического интерфейса, созданного нами ранее*/

        TextView textObjectPartA =(TextView) findViewById(R.id.textPartA);
        TextView textObjectPartB =(TextView) findViewById(R.id.textPartB);
        Button ObjectButtonChoice1 =(Button) findViewById(R.id.buttonChoice1);
        Button ObjectButtonChoice2 =(Button) findViewById(R.id.buttonChoice2);
        Button ObjectButtonChoice3 =(Button) findViewById(R.id.buttonChoice3);


        //Используем метод(функцию) setText, который описан в классах Button и //TextView для вывода на графический интерфейс значений переменных.
        textObjectPartA.setText("" + partA);
        textObjectPartB.setText("" + partB);
/*на данный момент нам не важно, какая кнопка будет
показывать правильный ответ,
а какая неправильный.*/
        ObjectButtonChoice1.setText("" + correctAnswer);
        ObjectButtonChoice2.setText("" + wrongAnswer1);
        ObjectButtonChoice3.setText("" + wrongAnswer2);

    }// метод onCreate заканчивается здесь



}
