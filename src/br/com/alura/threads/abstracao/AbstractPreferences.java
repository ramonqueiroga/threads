package br.com.alura.threads.abstracao;

import java.util.List;

/**
 * Created by Ramon Queiroga on 15/11/2016.
 */
public abstract class AbstractPreferences<T> {

    public T getTransformacaoPreference(List<String> preferences) {
        for (String preference : preferences) {
            if(preference.contains(getTipoPreference())){
                return transform(preference);
            }
        }
        return null;
    }

    public abstract String getTipoPreference();

    public abstract T transform(String preference);
}
