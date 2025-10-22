package com.example.dz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView gitCommands = findViewById(R.id.gitCommands);

        String text = ""
                + "1. git init\n"
                + "Создает новый локальный репозиторий Git.\n\n"
                + "2. git clone <url>\n"
                + "Клонирует существующий удалённый репозиторий на локальную машину.\n\n"
                + "3. git status\n"
                + "Показывает текущее состояние файлов в рабочем каталоге и индексе.\n\n"
                + "4. git add <file>\n"
                + "Добавляет указанные файлы в индекс (staging area).\n\n"
                + "5. git commit -m \"сообщение\"\n"
                + "Фиксирует изменения в репозитории с комментарием.\n\n"
                + "6. git log\n"
                + "Отображает историю коммитов текущей ветки.\n\n"
                + "7. git branch\n"
                + "Показывает список веток или создаёт новую при указании имени.\n\n"
                + "8. git checkout <ветка>\n"
                + "Переключается на указанную ветку или коммит.\n\n"
                + "9. git merge <ветка>\n"
                + "Объединяет изменения указанной ветки с текущей.\n\n"
                + "10. git push\n"
                + "Отправляет локальные коммиты в удалённый репозиторий.\n";

        gitCommands.setText(text);
    }
}
