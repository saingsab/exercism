(ns interest-is-interesting)

(defn- interest-rate-params
  [balance]
  (cond (neg? balance) -3.213
        (>= balance 5000M) 2.475
        (>= balance 1000M) 1.621
        :else 0.5))

(defn interest-rate
  "Returns the interest rate based on the specified balance."
  [balance]
  (double (interest-rate-params balance)))

(defn- annual-yield [balance]
  (let [multiplier (bigdec (/ (interest-rate balance) 100))]
    (cond (neg? balance) (* (- balance) multiplier)
          :else (* balance multiplier))))

(defn annual-balance-update
  "Returns the annual balance update, taking into account the interest rate."
  [balance]
  (+ balance (annual-yield balance)))

(defn amount-to-donate
  "Returns how much money to donate based on the balance and the tax-free percentage."
  [balance tax-free-percentage]
  (cond (neg? balance) 0
        :else (int (* balance (* 2.0 (/ tax-free-percentage 100.0))))))