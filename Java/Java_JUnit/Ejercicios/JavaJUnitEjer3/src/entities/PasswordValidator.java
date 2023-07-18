/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Arrays;

/**
 *
 * @author USER
 */
public class PasswordValidator {

    private String[] mayus =
    {
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };
    private String[] espe =
    {
        "@", "#", "$", "%", "&", "*"
    };
    private String[] num =
    {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
    };

    public boolean Validar(String password) {
        String[] paswordlist = password.split("");
        boolean b1 = false, b2 = false, b3 = false;
        if (paswordlist.length >= 8)
        {
            for (String lp : paswordlist)
            {
                if (Arrays.asList(mayus).contains(lp))
                {
                    b1 = true;
                }

                if (Arrays.asList(espe).contains(lp))
                {
                    b2 = true;
                }

                if (Arrays.asList(num).contains(lp))
                {
                    b3 = true;
                }

            }

        }

        return b1 & b2 & b3;

    }

}
