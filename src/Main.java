import ru.vsu.cs.group_6_1.bardakova_m_e.tree.TreeMapBidi;

public class Main {
    public static void main(String[] args) {

        TreeMapBidi<String, String> synonymDictionary = createMap();

        System.out.println("ДОБАВЛЕНИЕ В СЛОВАРЬ:");
        System.out.println("До добавления: синоним слова 'тёмный' - " + synonymDictionary.get("тёмный"));
        synonymDictionary.put("тёмный", "мрачный");
        System.out.println("После добавления: синоним слова 'тёмный' - " + synonymDictionary.get("тёмный"));
        System.out.println("После добавления: синоним слова 'мрачный' - " + synonymDictionary.getKeyByValue("мрачный"));

        System.out.println("\nПРЯМОЙ И ОБРАТНЫЙ ПОИСК СИНОНИМОВ:");
        System.out.println("Синоним слова 'грустный' - " + synonymDictionary.get("грустный"));
        System.out.println("Синоним слова 'печальный' - " + synonymDictionary.getKeyByValue("печальный"));

        System.out.println("\nПРОВЕРКА СУЩЕСТВОВАНИЯ СИНОНИМА:");
        System.out.println("Проверка слова 'умный' - " + synonymDictionary.containsKey("умный"));
        System.out.println("Проверка слова 'плохой' - " + synonymDictionary.containsKey("плохой"));
        System.out.println("Проверка слова 'светящийся' - " + synonymDictionary.containsValue("светящийся"));
        System.out.println("Проверка слова 'оглушительный' - " + synonymDictionary.containsValue("оглушительный"));

        System.out.println("\nПОИСК НЕСУЩЕСТВУЮЩИХ ЗНАЧЕНИЙ:");
        System.out.println("Несуществующее слово 'неизвестный' - " + synonymDictionary.get("неизвестный"));
        System.out.println("Несуществующее слово 'фантастический' - " + synonymDictionary.getKeyByValue("фантастический"));

        System.out.println("\nАВТОМАТИЧЕСКОЕ РАЗРЕШЕНИЕ КОНФЛИКТОВ:");
        System.out.println("До добавления конфликта:");
        System.out.println("  Синоним 'прекрасный' - " + synonymDictionary.getKeyByValue("прекрасный"));
        synonymDictionary.put("великолепный", "прекрасный");
        System.out.println("После добавления 'великолепный → прекрасный':");
        System.out.println("  'красивый' - " + synonymDictionary.get("красивый"));
        System.out.println("  'великолепный' - " + synonymDictionary.get("великолепный"));
        System.out.println("  Синоним 'прекрасный' - " + synonymDictionary.getKeyByValue("прекрасный"));

        System.out.println("\nУДАЛЕНИЕ ПАРЫ СИНОНИМОВ:");
        System.out.println("Размер словаря: " + synonymDictionary.size());
        String removedValue = synonymDictionary.remove("смелый");
        System.out.println("Удалено слово 'смелый', его синоним был: " + removedValue);
        System.out.println("Размер словаря после удаления: " + synonymDictionary.size());

        System.out.println("\nЗАМЕНА СИНОНИМА:");
        System.out.println("До замены: 'умный' - " + synonymDictionary.get("умный"));
        synonymDictionary.put("умный", "блестящий");
        System.out.println("После замены: 'умный' - " + synonymDictionary.get("умный"));

        System.out.println("\nСТАТИСТИКА:");
        System.out.println("Количество пар: " + synonymDictionary.size());
        System.out.println("Словарь пуст? - " + synonymDictionary.isEmpty());
    }

    private static TreeMapBidi<String, String> createMap(){

        TreeMapBidi<String, String> map = new TreeMapBidi<>();

        map.put("грустный", "печальный");
        map.put("быстрый", "стремительный");
        map.put("красивый", "прекрасный");
        map.put("умный", "разумный");
        map.put("большой", "огромный");
        map.put("маленький", "крошечный");
        map.put("холодный", "ледяной");
        map.put("горячий", "раскалённый");
        map.put("старый", "древний");
        map.put("новый", "современный");
        map.put("смелый", "отважный");
        map.put("трусливый", "боязливый");
        map.put("яркий", "светящийся");
        map.put("тихий", "бесшумный");
        map.put("громкий", "оглушительный");
        map.put("простой", "элементарный");
        map.put("сложный", "запутанный");
        map.put("хороший", "отличный");
        map.put("плохой", "ужасный");

        return map;
    }
}