(ns giggin.helpers)

(defn format-price
  [cents]
  (str "USD " (/ cents 100)))
