public class ContractedEmployee extends Employee implements Payable {
  private String federalTaxId;
  private double hourlyRate;
  private double numberOfHoursWorked;

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name);
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  public double calculatePay(){
    return hourlyRate * numberOfHoursWorked;
  }
}
