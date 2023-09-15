(ns cars-assemble)

(def default-rate 221)

(defn cal-rate [speed]
  (cond (= speed 10) 0.77
        (= speed 9) 0.8
        (>= speed 5) 0.9
        :else 1.0))

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (* (* default-rate speed)
     (cal-rate speed)))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (let [pro-rate (production-rate speed)]
    (int (/ pro-rate 60))))
