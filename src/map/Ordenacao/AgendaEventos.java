package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;


    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibir() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }


    public void obterProximoEvento() {
//        Set<LocalDate> dataSet = eventoMap.keySet();
//        Collection<Evento> value = eventoMap.values();
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("o proximo evento " + entry.getValue() + "na data " + entry.getKey());
            }
        }


    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.DECEMBER, 15), "evento1", "atraçao1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.APRIL, 16), "evento2", "atraçao2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 20), "evento3", "atraçao3");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.AUGUST, 29), "evento4", "atraçao4");


        agendaEventos.exibir();
        agendaEventos.obterProximoEvento();

    }

}
