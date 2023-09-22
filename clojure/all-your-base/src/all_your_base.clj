(ns all-your-base)

(defn convert [baseA num baseB] ;; <- arglist goes here
  ;; your code goes here
  (cond
    ;; (zero? (reduce + num)) 0
    (= 1 baseA) nil
    (= 1 baseB) nil
    (neg? (reduce + num)) nil
    (neg? baseA) nil
    (neg? baseB) nil
    (zero? baseA) nil
    (zero? baseB) nil
    (= (quote (0)) num) num)
  ;; :else (loop [power (- 1(count num)) base baseB]
  ;;         (recur (+ (* (Math/pow )))))
  )

  

  ;; (loop [number number, converted-number 0, power 0]
  ;;    (if (zero? number)
  ;;      converted-number
      ;;  (recur (quot number base) 
      ;;         (+ converted-number 
      ;;            (* (rem number base) (Math/pow base power))) 
      ;;         (inc power))
(map #(Math/abs %) (range -3 3))

(map #(* 3 % (Math/pow 3 %)) '(1 1 2 0))

(map #(* 3 % (Math/pow 3 %)) '(1 1 2 0))

(map #(* (Math/pow (dec 3)) %) '(1 1 2 0))

(loop [t 0 
       p 3
       n 3]
  (if (= n 0)
    t
    (recur (+ n t) (dec p) n)))

;; (3.0 3.0 9.0 1.0)
;; (27 7 6 0)
;; (9.0 9.0 54.0 0.0)

(loop [i 0]  
  (when (< i 5)    
    (println i)    
    (recur (inc i))))