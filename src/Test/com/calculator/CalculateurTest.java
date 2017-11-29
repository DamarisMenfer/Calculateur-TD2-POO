package com.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateurTest {
    @Test
    public void calculateVolume() throws Exception {
        Calculateur calculateur = new Calculateur();
        double volume = calculateur.calculateVolume(new Dimension(229, 169, 25));
        assertThat(volume).isEqualTo(0.967525);
    }

    @Test
    public void calculateFraisForColisLessThanGabarit() throws Exception {
        Calculateur calculateur = new Calculateur();
        double frais = calculateur.calculerFrais(new Dimension(229,162,24),180,"FR");
        assertThat(frais).isEqualTo(12);
    }

    @Test
    public void calculateFraisForPoidsLessThan1800() throws Exception {
        Calculateur calculateur = new Calculateur();
        double frais = calculateur.calculerFrais(new Dimension(253,215,164),1.565,"FR");
        assertThat(frais).isEqualTo(30.39);
    }

    @Test
    public void calculateFraisForPoidsMoreThan1800AndMaxIsPoids() throws Exception {
        Calculateur calculateur = new Calculateur();
        double frais = calculateur.calculerFrais(new Dimension(653,133,271),2.132,"FR");
        assertThat(frais).isEqualTo(46.09);
    }

    @Test
    public void calculateFraisForPoidsMoreThan1800AndMaxIsVolume() throws Exception {
        Calculateur calculateur = new Calculateur();
        double frais = calculateur.calculerFrais(new Dimension(653,331,271),3.650,"FR");
        assertThat(frais).isEqualTo(83.76);
    }




    @Test
    public void calculateFraisForColisLessThanGabaritMC() throws Exception {
        Calculateur calculateur = new Calculateur();
        double frais = calculateur.calculerFrais(new Dimension(229,162,24),180,"MC");
        assertThat(frais).isEqualTo(13.04);
    }

    @Test
    public void calculateFraisForPoidsLessThan1800MC() throws Exception {
        Calculateur calculateur = new Calculateur();
        double frais = calculateur.calculerFrais(new Dimension(253,215,164),1.565,"MC");
        assertThat(frais).isEqualTo(33.03);
    }

    @Test
    public void calculateFraisForPoidsMoreThan1800AndMaxIsPoidsMC() throws Exception {
        Calculateur calculateur = new Calculateur();
        double frais = calculateur.calculerFrais(new Dimension(653,133,271),2.132,"MC");
        assertThat(frais).isEqualTo(50.10);
    }

    @Test
    public void calculateFraisForPoidsMoreThan1800AndMaxIsVolumeMC() throws Exception {
        Calculateur calculateur = new Calculateur();
        double frais = calculateur.calculerFrais(new Dimension(653,331,271),3.650,"MC");
        assertThat(frais).isEqualTo(91.05);
    }
}
