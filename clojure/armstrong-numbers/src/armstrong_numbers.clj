(ns armstrong-numbers)

(defn armstrong? [num] ;; <- arglist goes here
  (let
   [digits     (map #(Character/getNumericValue %) (str num))
    count      (count digits)
    pow-digits (map #(apply * (repeat count %)) digits)]
    (= num (reduce + pow-digits))))