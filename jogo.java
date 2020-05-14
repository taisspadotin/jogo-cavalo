package musimais;

import javax.swing.JFrame;

import java.util.Timer;

import java.util.TimerTask;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import java.lang.*;

import javax.swing.ImageIcon;

public class musimais extends JFrame{

ImageIcon iconPp = new ImageIcon(getClass().getResource("pp.jpg"));

JLabel lcav = new JLabel(new ImageIcon(getClass().getResource("cavv.gif")));

JLabel lcavi = new JLabel(new ImageIcon(getClass().getResource("cavv2.gif")));

JLabel lcavii = new JLabel(new ImageIcon(getClass().getResource("ccv3.gif")));

JLabel lPp = new JLabel(iconPp);

public musimais(){

janela();

new Movimento().start();

}

public void janela(){

setDefaultCloseOperation(EXIT_ON_CLOSE);

setSize(1600,350);

setLocationRelativeTo(null);setLayout(null);

setVisible(true);

lcav.setBounds(0, 0, 200, 100);

lcavi.setBounds(0, 100, 200, 100);

lcavii.setBounds(0, 200, 200, 100);

lPp.setBounds(0, 0, 1400, 350);

add(lcav);

add(lcavi);

add(lcavii);

add(lPp);

}

public class Movimento extends Thread {

public void run() {

while(true){

try{sleep(10);}catch(Exception erro){}

if(lcav.getX()<1200){

lcav.setBounds(lcav.getX()+4, 0, 200,100);

}

if(lcavi.getX()<1200){

lcavi.setBounds(lcavi.getX()+3, 100, 200,100);

}

if(lcavii.getX()<1200){

lcavii.setBounds(lcavii.getX()+5, 200, 200,100);

}

}

}

}

public static void main(String[] args) {

// TODO Auto-generated method stub

String nome = null;

//int resposta;

int resposta =Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um cavalo (1,2 ou 3): "));

new musimais();

int interval = 100000; // intervalo de 1 seg.

Timer timer = new Timer();

int delay = 5000; // delay de 5 seg.

timer.scheduleAtFixedRate(new TimerTask() {

public void run() {

if(resposta==3){

JOptionPane.showMessageDialog(null,"cavalo 3 foi o vencedor¥nPARABENS");

}

else{

JOptionPane.showMessageDialog(null,"Cavalo 3 foi o vencedor¥nTENTE NOVAMENTE");

}

}

}, delay, interval);

}

}
