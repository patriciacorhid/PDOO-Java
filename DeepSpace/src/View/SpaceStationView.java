/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import deepspace.SpaceStationToUI;
import deepspace.HangarToUI;
import deepspace.WeaponToUI;
import deepspace.ShieldToUI;
import java.util.ArrayList;
import java.awt.Component;

/**
 *
 * @author David Cabezas Berrido
 * @author Patricia Córdoba Hidalgo
 */
public class SpaceStationView extends javax.swing.JPanel {
   
    HangarView hangarView;
    /**
     * Creates new form SpaceStationView
     */
    public SpaceStationView() {
        initComponents();
        
        hangarView = new HangarView();
        pHangar.add(hangarView);
        repaint();
        revalidate();
    }
    
    void setSpaceStation(SpaceStationToUI st){
        lAmmoPower.setText(Float.toString(st.getAmmoPower()));
        lFuelUnits.setText(Float.toString(st.getFuelUnits()));
        lShieldPower.setText(Float.toString(st.getShieldPower()));
        lnMedals.setText(Integer.toString(st.getnMedals()));
        lName.setText(st.getName());
        
        if(st.getHangar() == null){
            hangarView.setVisible(false);
            lNoHangar.setVisible(true);
        } else{
            lNoHangar.setVisible(false);
            hangarView.setHangar(st.getHangar());
            hangarView.setVisible(true);
        }
        
        pWeapons.removeAll();
        pShields.removeAll();
        ArrayList<WeaponToUI> w = st.getWeapons();
        ArrayList<ShieldToUI> s = st.getShieldBoosters();
        
        WeaponView wv;
        ShieldBoosterView sv;
        for(WeaponToUI x : w){
            wv = new WeaponView();
            wv.setWeapon(x);
            pWeapons.add(wv);
        }
        
        for(ShieldToUI x : s){
            sv = new ShieldBoosterView();
            sv.setShieldBooster(x);
            pShields.add(sv);
        }
        
        repaint();
        revalidate();
    }
    
    ArrayList<Integer> getSelectedWeapons(){
        ArrayList<Integer> sw = new ArrayList();
        int i = 0;
        for(Component c : pWeapons.getComponents()){
            if(((WeaponView)c).isSelected()){
                sw.add(i);
            }
            i++;
        }
        return sw;
    }
    
    ArrayList<Integer> getSelectedShields(){
        ArrayList<Integer> ss = new ArrayList();
        int i = 0;
        for(Component c : pShields.getComponents()){
            if(((ShieldBoosterView)c).isSelected()){
                ss.add(i);
            }
            i++;
        }
        return ss;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bDiscard = new javax.swing.JButton();
        bDiscardHangar = new javax.swing.JButton();
        bMount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lAmmoPower = new javax.swing.JLabel();
        lShieldPower = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lFuelUnits = new javax.swing.JLabel();
        lnMedals = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        scrollWeapons = new javax.swing.JScrollPane();
        pWeapons = new javax.swing.JPanel();
        scrollShields = new javax.swing.JScrollPane();
        pShields = new javax.swing.JPanel();
        pHangar = new javax.swing.JPanel();
        lNoHangar = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bDiscard.setText("Descartar");
        bDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDiscardActionPerformed(evt);
            }
        });

        bDiscardHangar.setText("Descartar Hangar Completo");

        bMount.setText("Equipar");
        bMount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMountActionPerformed(evt);
            }
        });

        jLabel1.setText("Potenciador de Ataque:");

        jLabel2.setText("Potenciador de Defensa:");

        lAmmoPower.setText("jLabel3");

        lShieldPower.setText("jLabel4");

        jLabel5.setText("Nivel de Combustible:");

        jLabel6.setText("Medallas:");

        lFuelUnits.setText("jLabel7");

        lnMedals.setText("jLabel8");

        lName.setText("NOMBRE");

        scrollWeapons.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Armas Montadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        scrollWeapons.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout pWeaponsLayout = new javax.swing.GroupLayout(pWeapons);
        pWeapons.setLayout(pWeaponsLayout);
        pWeaponsLayout.setHorizontalGroup(
            pWeaponsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        pWeaponsLayout.setVerticalGroup(
            pWeaponsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        scrollWeapons.setViewportView(pWeapons);

        scrollShields.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escudos Montados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        scrollShields.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout pShieldsLayout = new javax.swing.GroupLayout(pShields);
        pShields.setLayout(pShieldsLayout);
        pShieldsLayout.setHorizontalGroup(
            pShieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        pShieldsLayout.setVerticalGroup(
            pShieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        scrollShields.setViewportView(pShields);

        pHangar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lNoHangar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lNoHangar.setText("¡No tienes hangar!");
        pHangar.add(lNoHangar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollShields, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(scrollWeapons, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pHangar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(34, 34, 34)
                                        .addComponent(lAmmoPower))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lShieldPower)))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lnMedals)
                                    .addComponent(lFuelUnits)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bMount)
                                .addGap(43, 43, 43)
                                .addComponent(bDiscard)
                                .addGap(41, 41, 41)
                                .addComponent(bDiscardHangar)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(lName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lName)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lAmmoPower)
                    .addComponent(jLabel5)
                    .addComponent(lFuelUnits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lShieldPower)
                    .addComponent(jLabel6)
                    .addComponent(lnMedals))
                .addGap(18, 18, 18)
                .addComponent(scrollWeapons, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollShields, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pHangar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMount)
                    .addComponent(bDiscard)
                    .addComponent(bDiscardHangar))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bMountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bMountActionPerformed

    private void bDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDiscardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bDiscardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDiscard;
    private javax.swing.JButton bDiscardHangar;
    private javax.swing.JButton bMount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lAmmoPower;
    private javax.swing.JLabel lFuelUnits;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lNoHangar;
    private javax.swing.JLabel lShieldPower;
    private javax.swing.JLabel lnMedals;
    private javax.swing.JPanel pHangar;
    private javax.swing.JPanel pShields;
    private javax.swing.JPanel pWeapons;
    private javax.swing.JScrollPane scrollShields;
    private javax.swing.JScrollPane scrollWeapons;
    // End of variables declaration//GEN-END:variables
}
