package spring_security.Spring_security_myDemo.security;

public enum ApplicationUserPermision { //now we have a set of permissions(authorities; i.e what roles can do)
        STUDENT_READ("student:read"),
        STUDENT_WRITE("student:write"),
        COURSE_READ("course:read"),
        COURSE_WRITE("course:write");
        private final String persmission;

        ApplicationUserPermision(String persmission) {
                this.persmission = persmission;
        }

        public String getPersmission() {
                return persmission;
        }
}
