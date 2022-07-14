package assignment;

public class EmployeeQue17 {

	String emp_name, date_of_birth, date_of_joining, date_of_resign, work_location, department;
    double salary;

    public String getEmp_name() {
        return emp_name;
    }
        protected EmployeeQue17() {
            super();
    //TODO Auto-generated constructor stub
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        protected EmployeeQue17(String emp_name, String date_of_birth, String date_of_joining, String date_of_resign,
                String work_location, String department, double salary) 
        {
            super();
            this.emp_name = emp_name;
            this.date_of_birth = date_of_birth;
            this.date_of_joining = date_of_joining;
            this.date_of_resign = date_of_resign;
            this.work_location = work_location;
            this.department = department;
            this.salary = salary;
        }

        public void setEmp_name(String emp_name) {
            this.emp_name = emp_name;
        }

        public String getDate_of_birth() {
            return date_of_birth;
        }

        public void setDate_of_birth(String date_of_birth) {
            this.date_of_birth = date_of_birth;
        }

        public String getDate_of_joining() {
            return date_of_joining;
        }

        public void setDate_of_joining(String date_of_joining) {
            this.date_of_joining = date_of_joining;
        }

        public String getDate_of_resign() {
            return date_of_resign;
        }

        public void setDate_of_resign(String date_of_resign) {
            this.date_of_resign = date_of_resign;
        }

        public String getWork_location() {
            return work_location;
        }

        public void setWork_location(String work_location) {
            this.work_location = work_location;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
}
