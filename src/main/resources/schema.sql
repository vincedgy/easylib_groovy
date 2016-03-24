--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.5
-- Dumped by pg_dump version 9.4.5
-- Started on 2016-03-21 22:15:51

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 172 (class 1259 OID 16397)
-- Name: rclpab; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE rclpab (
    param_id integer NOT NULL,
    line_id integer NOT NULL,
    col01_val character varying(50),
    col02_val character varying(50),
    col03_val character varying(50),
    col04_val character varying(50),
    col05_val character varying(50),
    col06_val character varying(50),
    col07_val character varying(50),
    col08_val character varying(50),
    col09_val character varying(50),
    col10_val character varying(50),
    col11_val character varying(50),
    col12_val character varying(50),
    col13_val character varying(50),
    col14_val character varying(50),
    col15_val character varying(50)
);


ALTER TABLE rclpab OWNER TO postgres;

--
-- TOC entry 173 (class 1259 OID 16405)
-- Name: rclpac; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE rclpac (
    param_id integer NOT NULL,
    col_id integer NOT NULL,
    flag_pk character(1),
    flt_tp integer,
    col_desc character varying(50),
    col_label character varying(255)
);


ALTER TABLE rclpac OWNER TO postgres;

--
-- TOC entry 174 (class 1259 OID 16410)
-- Name: rclpah; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE rclpah (
    param_id integer NOT NULL,
    flag_gen character(1),
    lst_dt date,
    lst_usrid character varying(20),
    param_desc character varying(200),
    last_dt timestamp without time zone
);


ALTER TABLE rclpah OWNER TO postgres;

-- Completed on 2016-03-21 22:15:51

--
-- PostgreSQL database dump complete
--

