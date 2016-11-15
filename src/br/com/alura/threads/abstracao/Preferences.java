package br.com.alura.threads.abstracao;

import java.util.List;

/**
 * Created by Ramon Queiroga on 15/11/2016.
 */
public interface Preferences<T> {
    T transformPreference(List<String> preferences);
}
