package asdasd;


public class Person
{
        private String name;
        private int age;

        public Person(String name, int age)
        {
            setName(name);
            setAge(age);
        }

        public String getName()
        {
            return this.name;
        }

        public void setName(String name)
        {
            if (!name.isEmpty() && name.length() > 1) {
                this.name = name;
            } else {
                throw new IllegalArgumentException("Name should not be empty and must be atleast 2 symbols long.");
            }
        }

        public int getAge()
        {
            return this.age;
        }

        public void setAge(int age)
        {
            if (age < 0 || age > 110) {
                throw new IllegalArgumentException("Age should be between 0 and 110.");
            }
            this.age = age;
        }

        @Override
        public String toString()
        {
            StringBuilder sb = new StringBuilder();
            sb.append(this.getName() + " " + this.getAge());

            return sb.toString();
        }
}
