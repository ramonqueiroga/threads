package br.com.alura.threads.abstracao;

import java.util.List;

/**
 * Created by Ramon Queiroga on 15/11/2016.
 */
public class MelhorPrecoPreference extends AbstractPreferences<MelhorPreco> implements Preferences<MelhorPreco> {

    public static final String BESTPRICING = "bestpricing";

    @Override
    public MelhorPreco transformPreference(List<String> preferences) {
        return getTransformacaoPreference(preferences);
    }

    @Override
    public String getTipoPreference() {
        return BESTPRICING;
    }

    @Override
    public MelhorPreco transform(String preference) {
        Boolean isBestpricing = Boolean.valueOf(preference.split(":")[1]);
        if(!isBestpricing) {
            return MelhorPreco.NAO;
        }
        return MelhorPreco.SIM;
    }
}
