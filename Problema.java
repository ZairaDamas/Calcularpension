package While;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Problema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, j, pensionanual = 0, pensionmensual = 0, pensiontotal = 0, pensiontotalmensual = 0, suma = 0, z = 0,
				total = 0, g = 0;
		String añosdeservicio = "0", edad, empleados, puesto = null;
		String n = JOptionPane.showInputDialog("Numero de sucursales");
		int s = Integer.parseInt(n);
		int a = Integer.parseInt(añosdeservicio);

		do {
			while (i <= s) {

				empleados = JOptionPane.showInputDialog(" Sucursal " + i + " \n Numero de empleados");
				int em = Integer.parseInt(empleados);
				suma = suma + em;
				i++;
				for (j = 1; j <= em; j++) {
					edad = JOptionPane.showInputDialog("Empleado " + j + " \n Edad");
					int e = Integer.parseInt(edad);

					if (e < 40) {
						JOptionPane.showMessageDialog(null, "Aun estas chavo trabaja duro men :v");
						z++;
					}

					if (e >= 40) {

						puesto = JOptionPane.showInputDialog(
								"Ingrese Puesto \n *SECRETARIA \n *INGENIERO \n *ACOMODADOR \n *GERENTE \n *CONSERJE \n *LICENCIADO \n *SOPORTE TECNICO \n *CONTADOR \n *ADMINISTRADOR \n *SALIR");

						switch (puesto) {
						case "SECRETARIA":
							añosdeservicio = JOptionPane.showInputDialog("Años de servicio");
							a = Integer.parseInt(añosdeservicio);
							pensionmensual = a * 45;
							pensionanual = pensionmensual * 12;
							pensiontotal = pensiontotal + pensionanual;
							pensiontotalmensual = pensiontotal + pensionmensual;

							break;
						case "INGENIERO":
							añosdeservicio = JOptionPane.showInputDialog("Años de servicio");
							a = Integer.parseInt(añosdeservicio);
							pensionmensual = a * 88;
							pensionanual = pensionmensual * 12;
							pensiontotal = pensiontotal + pensionanual;
							pensiontotalmensual = pensiontotal + pensionmensual;

							break;
						case "ACOMODADOR":
							añosdeservicio = JOptionPane.showInputDialog("Años de servicio");
							a = Integer.parseInt(añosdeservicio);
							pensionmensual = a * 35;
							pensionanual = pensionmensual * 12;
							pensiontotal = pensiontotal + pensionanual;
							pensiontotalmensual = pensiontotal + pensionmensual;

							break;
						case "GERENTE":
							añosdeservicio = JOptionPane.showInputDialog("Años de servicio");
							a = Integer.parseInt(añosdeservicio);
							pensionmensual = a * 70;
							pensionanual = pensionmensual * 12;
							pensiontotal = pensiontotal + pensionanual;
							pensiontotalmensual = pensiontotal + pensionmensual;

							break;
						case "CONSERJE":
							añosdeservicio = JOptionPane.showInputDialog("Años de servicio");
							a = Integer.parseInt(añosdeservicio);
							pensionmensual = a * 30;
							pensionanual = pensionmensual * 12;
							pensiontotal = pensiontotal + pensionanual;
							pensiontotalmensual = pensiontotal + pensionmensual;

							break;
						case "LICENCIADO":
							añosdeservicio = JOptionPane.showInputDialog("Años de servicio");
							a = Integer.parseInt(añosdeservicio);
							pensionmensual = a * 35;
							pensionanual = pensionmensual * 12;
							pensiontotal = pensiontotal + pensionanual;
							pensiontotalmensual = pensiontotal + pensionmensual;

							break;
						case "SOPORTE TECNICO":
							añosdeservicio = JOptionPane.showInputDialog("Años de servicio");
							a = Integer.parseInt(añosdeservicio);
							pensionmensual = a * 82;
							pensionanual = pensionmensual * 12;
							pensiontotal = pensiontotal + pensionanual;
							pensiontotalmensual = pensiontotal + pensionmensual;

							break;
						case "CONTADOR":
							añosdeservicio = JOptionPane.showInputDialog("Años de servicio");
							a = Integer.parseInt(añosdeservicio);
							pensionmensual = a * 78;
							pensionanual = pensionmensual * 12;
							pensiontotal = pensiontotal + pensionanual;
							pensiontotalmensual = pensiontotal + pensionmensual;

							break;
						case "ADMINISTRADOR":
							añosdeservicio = JOptionPane.showInputDialog("Años de servicio");
							a = Integer.parseInt(añosdeservicio);
							pensionmensual = a * 80;
							pensionanual = pensionmensual * 12;
							pensiontotal = pensiontotal + pensionanual;
							pensiontotalmensual = pensiontotal + pensionmensual;

							break;
						case "CANCELAR":
							JOptionPane.showMessageDialog(null, "Se Cancelo la operacion");
							System.exit(0);

						default:
							JOptionPane.showMessageDialog(null, "Las pensiones no estan disponibles para su puesto");
						}
						total = em - z;
					}
					JOptionPane.showMessageDialog(null,
							"Pension anual: " + pensionanual + " \n Pension mensual: " + pensionmensual + "");

				}
				JOptionPane.showMessageDialog(null,
						"Pension total a pagar mesual es: " + pensiontotalmensual
								+ " \n Pension total a pagar de la empresa " + pensiontotal + " \n Total de empleados: "
								+ suma + " \n Numero de pensionados: " + total + " \n No pensionados: " + z + "");

			}

		} while (puesto != "SALIR");

	}

}
