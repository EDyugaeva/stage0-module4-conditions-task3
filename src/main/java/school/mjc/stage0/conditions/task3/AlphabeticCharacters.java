package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        character = Character.toLowerCase(character);
        if (character < 65 || character > 122) {
            System.out.println("wrong alphabet!");
        } else if (character == 'a' || character == 'e' || character == 'u' || character == 'i' || character == 'o'
                || character == 'j') {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
