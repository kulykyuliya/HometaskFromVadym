package Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUsers extends DataBase {

    @Test
    public void checkUsersByAgeMoreThan20() {
        userList = printAviable(getUsersList(), new UsersCheck() {
            @Override
            public boolean checkAviable(User user) {
                return user.getAge() > 20;
            }
        });

        Assert.assertTrue(userList.size() != 0);
        for (User user : userList) {
            Assert.assertTrue(user.getAge() > 20);
        }
    }

    @Test
    public void checkUsersByWeightMoreThan70() {
        userList = printAviable(getUsersList(), new UsersCheck() {
            @Override
            public boolean checkAviable(User user) {
                return user.getWeight() > 70;
            }
        });

        Assert.assertTrue(userList.size() != 0);
        for (User user : userList) {
            Assert.assertTrue(user.getWeight() > 70);
        }
    }

    @Test
    public void checkUsersBySex() {
        userList = printAviable(getUsersList(), new UsersCheck() {
            @Override
            public boolean checkAviable(User user) {
                return user.isSex();
            }
        });

        Assert.assertTrue(userList.size() != 0);
        for (User user : userList) {
            Assert.assertTrue(user.isSex());
        }
    }

    @Test
    public void checkUsersByWeightUntil100() {
        userList = printAviable(getUsersList(), new UsersCheck() {
            @Override
            public boolean checkAviable(User user) {
                return user.getWeight() < 100;
            }
        });

        Assert.assertTrue(userList.size() != 0);
        for (User user : userList) {
            Assert.assertTrue(user.getWeight() < 100);
        }
    }

    @Test
    public void checkUsersBySpeciality() {
        userList = printAviable(getUsersList(), new UsersCheck() {
            @Override
            public boolean checkAviable(User user) {
                return user.getAge() < 30;
            }
        });

        Assert.assertTrue(userList.size() != 0);
        for (User user : userList) {
            Assert.assertTrue(user.getAge() < 30);
        }
    }

    @Test
    public void checkUsersBySpecialityAndAge() {
        userList = printAviable(getUsersList(), new UsersCheck() {
            @Override
            public boolean checkAviable(User user) {
                return user.getAge() < 30 && (user.getSpeciality().contains("QA"));
            }
        });

        Assert.assertTrue(userList.size() != 0);
        for (User user : userList) {
            Assert.assertTrue((user.getSpeciality().contains("QA")) && user.getAge() < 30);
        }
    }

    @Test
    public void checkUsersBySpecialityAndWeight() {
        userList = printAviable(getUsersList(), new UsersCheck() {
            @Override
            public boolean checkAviable(User user) {
                return (user.getSpeciality().contains("student") && user.getWeight() > 30);
            }
        });

        Assert.assertTrue(userList.size() != 0);
        for (User user : userList) {
            Assert.assertTrue(user.getSpeciality().contains("student") && user.getWeight() > 30);
        }
    }

    @Test
    public void checkUsersByPhDAndSex() {
        userList = printAviable(getUsersList(), new UsersCheck() {
            @Override
            public boolean checkAviable(User user) {
                return user.getSpeciality().contains("Phd") && user.isSex();
            }
        });

        Assert.assertTrue(userList.size() != 0);
        for (User user : userList) {
            Assert.assertTrue(user.getSpeciality().contains("Phd") && user.isSex());
        }
    }

    @Test
    public void checkUsersByAgeAngSex() {
        userList = printAviable(getUsersList(), new UsersCheck() {
            @Override
            public boolean checkAviable(User user) {
                return user.getAge()>15 && (user.isSex());
            }
        });

        Assert.assertTrue(userList.size() != 0);
        for (User user : userList) {
            Assert.assertTrue(user.getAge()>15 && (user.isSex()));

        }
    }

    @Test
    public void checkUsersByNameAndPnd() {
        userList = printAviable(getUsersList(), new UsersCheck() {
            @Override
            public boolean checkAviable(User user) {
                return user.getName().contains("Iryna") && (user.getSpeciality().contains("Phd"));
            }
        });

        Assert.assertTrue(userList.size() != 0);
        for (User user : userList) {
            Assert.assertTrue(user.getName().contains("Iryna") && (user.getSpeciality().contains("Phd")));

        }
    }
    }






