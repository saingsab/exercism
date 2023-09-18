(ns squeaky-clean
  (:require [clojure.string :as str]))

(defn clean
  "TODO: add docstring"
  [s]
  (str/replace s " " "_")
  (if (str/includes? '\u0000' '\u001F' '\u007F' '\u009F') (str/replace s " " "CTRL"))
  ;; (str/replace s "CTRL" "") 
  )
