use std::fmt;
const MINUTES_PER_DAY: i64 = 24*60;
const MINUTES_PER_HOUR: i64 = 60;
#[derive(Debug, Eq, PartialEq)]
pub struct Clock {
    minutes: i64,
}
impl Clock {
    pub fn new(hours: i64, minutes: i64) -> Self {        
        Clock {
            minutes: (hours * MINUTES_PER_HOUR + minutes).rem_euclid(MINUTES_PER_DAY),
        }
    }
    pub fn add_minutes(&self, minutes: i64) -> Self {
        Clock::new(0, self.minutes + minutes)
    }
}
impl fmt::Display for Clock {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        write!(
            f,
            "{:02}:{:02}",
            self.minutes.div_euclid(MINUTES_PER_HOUR),
            self.minutes.rem_euclid(MINUTES_PER_HOUR)
        )
    }
}
