package br.com.alura.threads.abstracao;

import java.util.List;

/**
 * Created by Ramon Queiroga on 15/11/2016.
 */
public class CambioPreferences extends AbstractPreferences<Cambio> implements Preferences<Cambio> {

    static final String CURRENCY = "currency";

    @Override
    public Cambio transformPreference(List<String> preferences) {
        return this.getTransformacaoPreference(preferences);
    }

    @Override
    public String getTipoPreference() {
        return CURRENCY;
    }

    @Override
    public Cambio transform(String preference) {
        String pref = preference.split(":")[1];
        Cambio cambio = new Cambio();
        cambio.setCambio(pref);
        return cambio;
    }

}
