-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-07-2024 a las 22:04:02
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `quechualingo`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarPuntosUsuario` (IN `usuarioID` INT, IN `puntosAgregados` INT)   BEGIN
    UPDATE usuario_puntaje
    SET puntaje = puntaje + puntosAgregados
    WHERE IDusuario = usuarioID;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `AsignarIntermedio` (IN `usuarioID` INT)   BEGIN
	UPDATE usuario_nivel SET Idnivel = 2
    WHERE IDusuario = usuarioID;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `AsignarNivelAvanzado` (IN `usuarioID` INT)   BEGIN
    UPDATE usuario_nivel SET Idnivel = 3
    WHERE IDusuario = usuarioID;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `AsignarNivelExperto` (IN `usuarioID` INT)   BEGIN
    INSERT INTO usuario_nivel (IDusuario, Idnivel)
    VALUES (usuarioID, 4);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `AsignarNivelNovato` (IN `usuarioID` INT)   BEGIN
    INSERT INTO usuario_nivel (IDusuario, Idnivel)
    VALUES (usuarioID, 1);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `LlenarTopPuntajes` ()   BEGIN
    -- Truncar la tabla toppuntajes
    TRUNCATE TABLE toppuntajes;

    -- Insertar los primeros 100 puntajes en la tabla toppuntajes
    INSERT INTO toppuntajes (IdTOP, IDusuario)
    SELECT 
        (@row_number := @row_number + 1) AS IdTOP, 
        IDusuario
    FROM (
        SELECT IDusuario, puntaje
        FROM usuario_puntaje
        ORDER BY puntaje DESC
        LIMIT 100
    ) AS Top100
    CROSS JOIN (SELECT @row_number := 0) AS init;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `MostrarTopPuntajesConNivel` ()   BEGIN
    SELECT t.IdTOP, u.nombre AS NombreUsuario, up.puntaje AS Puntos, n.nombre AS Nivel
    FROM toppuntajes t
    INNER JOIN usuario u ON t.IDusuario = u.ID
    INNER JOIN usuario_puntaje up ON t.IDusuario = up.IDusuario
    INNER JOIN usuario_nivel un ON u.ID = un.IDusuario
    INNER JOIN nivel n ON un.Idnivel = n.ID
    ORDER BY t.IdTOP;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `glosario`
--

CREATE TABLE `glosario` (
  `IDGlosario` int(11) NOT NULL,
  `español` varchar(50) NOT NULL,
  `quechua` varchar(50) NOT NULL,
  `indicadorGlo` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `glosario`
--

INSERT INTO `glosario` (`IDGlosario`, `español`, `quechua`, `indicadorGlo`) VALUES
(1, 'Hola', 'Allinllachu', 'S'),
(2, 'Adios', 'tupanchikkama', 'S'),
(4, 'gvg', 'bvbbv', 'N'),
(5, 'oooooo', 'aaaaa', 'N'),
(6, 'fdvfdv', 'vgfvgv', 'N'),
(7, 'uuuuuu', 'rrrrrr', 'N'),
(8, 'hi', 'hello', 'N');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nivel`
--

CREATE TABLE `nivel` (
  `ID` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `nivel`
--

INSERT INTO `nivel` (`ID`, `nombre`) VALUES
(1, 'Novato'),
(2, 'Intermedio'),
(3, 'Avanzado'),
(4, 'Experto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `toppuntajes`
--

CREATE TABLE `toppuntajes` (
  `IdTOP` int(11) NOT NULL,
  `IDusuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `toppuntajes`
--

INSERT INTO `toppuntajes` (`IdTOP`, `IDusuario`) VALUES
(3, 6),
(1, 8),
(2, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID`, `email`, `pass`, `nombre`) VALUES
(6, 'diego12@gmail.com', '123456', 'Diego12'),
(8, 'diego22@gmail.com', '123456', 'Diego22'),
(9, 'sebas123@hotmail.com', 'guaripolo69', 'Sebastian Cardenas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_nivel`
--

CREATE TABLE `usuario_nivel` (
  `IDusuario` int(11) NOT NULL,
  `Idnivel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario_nivel`
--

INSERT INTO `usuario_nivel` (`IDusuario`, `Idnivel`) VALUES
(6, 1),
(9, 1),
(8, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_puntaje`
--

CREATE TABLE `usuario_puntaje` (
  `IDusuario` int(11) NOT NULL,
  `puntaje` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario_puntaje`
--

INSERT INTO `usuario_puntaje` (`IDusuario`, `puntaje`) VALUES
(6, 0),
(8, 520),
(9, 35);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `glosario`
--
ALTER TABLE `glosario`
  ADD PRIMARY KEY (`IDGlosario`);

--
-- Indices de la tabla `nivel`
--
ALTER TABLE `nivel`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `toppuntajes`
--
ALTER TABLE `toppuntajes`
  ADD PRIMARY KEY (`IdTOP`),
  ADD KEY `IDusuario` (`IDusuario`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuario_nivel`
--
ALTER TABLE `usuario_nivel`
  ADD PRIMARY KEY (`IDusuario`),
  ADD KEY `Idnivel` (`Idnivel`);

--
-- Indices de la tabla `usuario_puntaje`
--
ALTER TABLE `usuario_puntaje`
  ADD PRIMARY KEY (`IDusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `glosario`
--
ALTER TABLE `glosario`
  MODIFY `IDGlosario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `toppuntajes`
--
ALTER TABLE `toppuntajes`
  ADD CONSTRAINT `toppuntajes_ibfk_1` FOREIGN KEY (`IDusuario`) REFERENCES `usuario` (`ID`);

--
-- Filtros para la tabla `usuario_nivel`
--
ALTER TABLE `usuario_nivel`
  ADD CONSTRAINT `usuario_nivel_ibfk_1` FOREIGN KEY (`IDusuario`) REFERENCES `usuario` (`ID`),
  ADD CONSTRAINT `usuario_nivel_ibfk_2` FOREIGN KEY (`Idnivel`) REFERENCES `nivel` (`ID`);

--
-- Filtros para la tabla `usuario_puntaje`
--
ALTER TABLE `usuario_puntaje`
  ADD CONSTRAINT `usuario_puntaje_ibfk_1` FOREIGN KEY (`IDusuario`) REFERENCES `usuario` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
