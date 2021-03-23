package com.gmail.jpalvesl101;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import java.util.regex.*;

public class Cadastro {
    private ArrayList database = new ArrayList<Usuario>();

    public boolean cadastrar(Usuario user) {
        Pattern p = Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");

        if (user.getNome() == null || user.getData_nasc() == null || user.getGrupo_de_risco() == null) return false;

        else if (!StringUtils.isAlphaSpace(user.getNome())) return false;

        else if (!p.matcher(user.getData_nasc()).matches()) return false;

        database.add(user);
        return true;
    }
}
