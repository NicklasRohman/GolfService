--liquibase formatted sql

--changeset nicklas.rohman:1 logicalFilePath:00_golf_structure.sql
--comment: Adding structure for gamesetup

START TRANSACTION;

--
-- Databas: `golfprogram`
--

-- --------------------------------------------------------

--
-- Tabellstruktur `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `course_id` bigint(20) NOT NULL,
  `course_name` varchar(250) CHARACTER SET utf8 COLLATE utf8_swedish_ci NOT NULL DEFAULT '""',
  `hole1` int(3) NOT NULL DEFAULT '4',
  `hole2` int(3) NOT NULL DEFAULT '4',
  `hole3` int(3) NOT NULL,
  `hole4` int(3) NOT NULL,
  `hole5` int(3) NOT NULL,
  `hole6` int(3) NOT NULL,
  `hole7` int(3) NOT NULL,
  `hole8` int(3) NOT NULL,
  `hole9` int(3) NOT NULL,
  `hole10` int(3) NOT NULL,
  `hole11` int(3) NOT NULL,
  `hole12` int(3) NOT NULL,
  `hole13` int(3) NOT NULL,
  `hole14` int(3) NOT NULL,
  `hole15` int(3) NOT NULL,
  `hole16` int(3) NOT NULL,
  `hole17` int(3) NOT NULL,
  `hole18` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellstruktur `player`
--

CREATE TABLE IF NOT EXISTS `player` (
  `player_id` bigint(11) NOT NULL,
  `player_name` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_swedish_ci NOT NULL DEFAULT '""'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `player`
--

-- --------------------------------------------------------

--
-- Tabellstruktur `round`
--

CREATE TABLE IF NOT EXISTS `round` (
  `roundID` bigint(20) NOT NULL,
  `playerID` bigint(20) NOT NULL,
  `courseID` bigint(20) NOT NULL,
  `hole1` int(11) NOT NULL,
  `hole2` int(11) NOT NULL,
  `hole3` int(11) NOT NULL,
  `hole4` int(11) NOT NULL,
  `hole5` int(11) NOT NULL,
  `hole6` int(11) NOT NULL,
  `hole7` int(11) NOT NULL,
  `hole8` int(11) NOT NULL,
  `hole9` int(11) NOT NULL,
  `hole10` int(11) NOT NULL,
  `hole11` int(11) NOT NULL,
  `hole12` int(11) NOT NULL,
  `hole13` int(11) NOT NULL,
  `hole14` int(11) NOT NULL,
  `hole15` int(11) NOT NULL,
  `hole16` int(11) NOT NULL,
  `hole17` int(11) NOT NULL,
  `hole18` int(11) NOT NULL,
  `totalScore` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Index för tabell `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`course_id`);

--
-- Index för tabell `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`player_id`);

--
-- Index för tabell `round`
--
ALTER TABLE `round`
  ADD PRIMARY KEY (`roundID`);

--
-- AUTO_INCREMENT för tabell `course`
--
ALTER TABLE `course`
  MODIFY `course_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;

--
-- AUTO_INCREMENT för tabell `player`
--
ALTER TABLE `player`
  MODIFY `player_id` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;

--
-- AUTO_INCREMENT för tabell `round`
--
ALTER TABLE `round`
  MODIFY `roundID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;
COMMIT;
