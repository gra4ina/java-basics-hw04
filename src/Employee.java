  public abstract class Employee implements Payable {
  private String employeeId;
  private String name;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return calculatePay();
  }

  @Override
  public String toString() {
    String format = "%.2f";
    return this.name + ", employeeId " + this.employeeId + " average salary is " + String.format(format, getAverageMonthlySalary());
    }
  }

