package converter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tim on 27.02.2017.
 */
public class ShortcutList {

    private List<String> shortcuts = new ArrayList<String>();

    public ShortcutList(String path)
    {
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {

                shortcuts.add(line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<String> getShortcuts() {
        return shortcuts;
    }

}
