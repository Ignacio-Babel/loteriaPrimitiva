package com.babel.loteriaPrimitiva.Servicio.Clases;

import com.babel.loteriaPrimitiva.Servicio.Interfaces.IApuestaServicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ApuestaServicio implements IApuestaServicio {

    private static final Logger logger = LoggerFactory.getLogger(ApuestaServicio.class);
    private Map<Integer, List<List<Integer>>> userBets = new HashMap<>();

    @Override
    public void registrarApuesta(int userId, List<Integer> numeros) {
        if (userBets.containsKey(userId)) {
            userBets.get(userId).add(numeros);
        } else {
            List<List<Integer>> bets = new ArrayList<>();
            bets.add(numeros);
            userBets.put(userId, bets);
            logger.debug("Apuesta registrado - ID: {"+userId+"}, Numeros: {"+numeros+"}");
        }
    }

    @Override
    public List<Integer> obtenerApuesta(int userId, int apuestaId) {
        if (userBets.containsKey(userId) && apuestaId >= 0 && apuestaId < userBets.get(userId).size()) {
            logger.info("apuesta obtenida - ID Usuario: {"+userId+"}, Apuesta ID: {"+apuestaId+"}");
            return userBets.get(userId).get(apuestaId);
        }
        logger.error("Apuesta no encontrada");
        return null;
    }
}
