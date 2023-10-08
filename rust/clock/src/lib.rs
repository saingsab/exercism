pub struct Clock {
    hours: i32,
    minutes: i32,
}

impl Clock {
    pub fn new(hours: i32, minutes: i32) -> Self {
        /*  todo!("Construct a new Clock from {hours} hours and {minutes} minutes");
         hours.to_string(); */
        String::from(hours.to_string());

    }

    pub fn add_minutes(&self, minutes: i32) -> Self {
        todo!("Add {minutes} minutes to existing Clock time");
    }
}
